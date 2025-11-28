import task0
import time
start_time = time.time()
tokens = task0.reading()
data = task0.parsing(tokens)
def task1(data):
    lessons = data["schedule"]["lesson"]
    with open("schedule1.ini", "w", encoding="utf-8") as f:
        for i, lesson in enumerate(lessons):
            print(f"[schedule.lesson.{i+1}]")
            f.write(f"[schedule.lesson.{i+1}]\n")
            for key, value in lesson.items():
                if isinstance(value, dict):
                    for mini_key, mini_value in value.items():
                        print(f"{key}.{mini_key} = {mini_value}")
                        f.write(f"{key}.{mini_key} = {mini_value}\n")
                else:
                    print(f"{key} = {value}")
                    f.write(f"{key} = {value}\n")
            print("")
            f.write("\n")
task1(data)
end_time = time.time()
print(f"время выполнения {end_time - start_time}")