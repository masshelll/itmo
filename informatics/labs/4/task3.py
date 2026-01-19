import task0
import time
start_time = time.time()
tokens = task0.reading()
data = task0.parsing(tokens)
def task2(data):
    lessons_list = data["schedule"]["lesson"]
    with open("output.xml", "w", encoding="utf-8") as f:
        space = "    "
        f.write("<schedule>\n")
        for lesson in lessons_list:
            f.write(f"{space*1}<lesson>\n")
            for key, value in lesson.items():
                if isinstance(value, dict):
                    f.write(f"{space*2}<{key}>\n")
                    for mini_key, mini_value in value.items():
                        f.write(f"{space*3}<{mini_key}>{mini_value}</{mini_key}>\n")
                    f.write(f"{space*2}</{key}>\n")
                else:
                    f.write(f"{space*2}<{key}>{value}</{key}>\n")
            f.write(f"{space*1}</lesson>\n")
        f.write("</schedule>\n")

task2(data)
end_time = time.time()
print(f"время выполнения {end_time - start_time}")