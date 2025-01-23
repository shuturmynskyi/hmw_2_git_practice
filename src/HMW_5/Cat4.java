package HMW_5;

public class Cat4 {
    private String fullName;

    public void setName(String firstName, String lastName) {
        // Використовуємо ключове слово this, щоб звернутися до поля класу
        this.fullName = firstName + " " + lastName;
        // Додаємо пробіл між ім'ям і прізвищем для кращого відображення
    }

    // Якщо потрібно, можна додати гетер для перевірки
    public String getFullName() {
        return fullName;
    }
}
