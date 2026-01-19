import hcl2
import configparser
import time
start_time = time.time()
def convert_to_py():
    with open("schedule1.hcl", "r", encoding="utf-8") as f:
        content = hcl2.load(f)
        return content

def convert_to_ini(data, filename):
    config = configparser.ConfigParser()
    lessons = data['schedule'][0]['lesson']
    for i, lesson in enumerate(lessons):
        section = f"schedule.lesson.{i+1}"
        config.add_section(section)
        for key, value in lesson.items():
            if isinstance(value, dict):
                for mini_key, mini_value in value.items():
                    config.set(section, f"{key}.{mini_key}", str(mini_value))
            else:
                config.set(section, key, str(value))
    with open('output_lib.ini', 'w', encoding='utf-8') as f:
        config.write(f)

res = convert_to_py()
print(res)
convert_to_ini(res, "output_lib.ini")
end_time = time.time()
print(f"время выполнения {end_time - start_time}")