🎰 Задача: Лототрон (RandomPicker без повторов)
📌 Цель:
Реализовать систему лототрона, которая хранит список участников и случайным образом выбирает их без повторов,
пока список не закончится.

Необходимые классы:
1️⃣ Класс LotteryMachine<T>
Обобщённый класс, реализующий механизм лототрона.

🔹 Поля:
private List<T> allItems — список всех участников

private Queue<T> queue — очередь перемешанных участников

private boolean initialized — флаг, показывающий, начат ли розыгрыш

🔹 Методы:
public void add(T item)
Добавляет нового участника. Можно вызывать только до начала розыгрыша.

public void init()
Инициализирует лототрон: перемешивает список и добавляет участников в очередь.  
(Collections.shuffle - этот метод перемешивает колекцию которую отправляете в аргументе)

public T pick()
Выбирает одного случайного участника (из начала очереди).
Если розыгрыш не начат — init() вызывается автоматически.
Если очередь пуста — возвращает null.

public void reset()
Начать новый раунд: перемешивает всех участников заново и возвращает их в очередь.

public int remaining()
Возвращает количество оставшихся участников в текущем раунде.


2️⃣ Класс Main
В main():
Создай экземпляр LotteryMachine<String>

Добавь участников через add(...)

Вызови pick() в цикле — пока не останется никого

Сделай reset() и повтори


✅ Пример main:

public class Main {
public static void main(String[] args) {
LotteryMachine<String> lotto = new LotteryMachine<>();

        // Добавляем участников
        lotto.add("Катя");
        lotto.add("Олег");
        lotto.add("Аня");

        System.out.println("🎰 Первый розыгрыш:");
        String name;
        while ((name = lotto.pick()) != null) {
            System.out.println("Выбран: " + name);
        }

        System.out.println("\n🔁 Новый розыгрыш:");
        lotto.reset();
        while ((name = lotto.pick()) != null) {
            System.out.println("Снова выбран: " + name);
        }
    }
}

