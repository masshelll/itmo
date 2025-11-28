import time
start_time = time.time()
def reading():
    with open('schedule1.hcl', 'r', encoding='utf-8') as f:
        hcl_content = f.read()
        i = 0
        token = []
        while i < len(hcl_content):
            this_i = hcl_content[i]
            if this_i.isspace():
                i += 1
                continue
            if this_i in ['{', '}', '[', ']', '=', ',']:
                token.append(this_i)
                i += 1
                continue
            if this_i == '#':
                while hcl_content[i] != '\n':
                    i += 1
                    continue
            if this_i == '"':
                stroka = ""
                i += 1
                while i < len(hcl_content) and hcl_content[i] != '"':
                    stroka += hcl_content[i]
                    i += 1
                token.append(stroka)
                if i < len(hcl_content):
                    i += 1  #Перешагиваем закрывающую кавычку
                continue
            if this_i.isalnum() or this_i in ['-', '_', '.']:
                word = ""
                while i < len(hcl_content) and (hcl_content[i].isalnum() or hcl_content[i] in ['_', '-', '.']):
                    word += hcl_content[i]
                    i += 1
                token.append(word)
                continue
        return token

reading()
tokens = reading()
print(tokens)
def parsing(token):
    dict = {}
    while len(token) > 0:
        if token[0] == '}':
            token.pop(0)
            return dict
        key = token.pop(0)
        entity = token[0]
        if entity == '=':
            token.pop(0)
            if token[0] == '[':
                token.pop(0)
                my_list = []
                while token[0] != ']':
                    if token[0] == ',':
                        token.pop(0)
                        continue
                    if token[0] == '{':
                        token.pop(0)
                        block_inside = parsing(token)
                        my_list.append(block_inside)
                    else:
                        val = token.pop(0)
                        if val.isdigit():
                            val = int(val)
                        my_list.append(val)
                token.pop(0)
                dict[key] = my_list
            elif token[0] == '{':
                token.pop(0)
                n_block = parsing(token)
                dict[key] = n_block
            else:
                value = token.pop(0)
                #для чисел в строчке isdigital()
                if value.isdigit():
                    value = int(value)
                dict[key] = value
        elif entity == '{':
            token.pop(0)
            parsing_block = parsing(token)
            dict[key] = parsing_block
    return dict

tokens = reading()
result = parsing(tokens)
print(result)
end_time = time.time()
print(f"время выполнения {end_time - start_time}")

