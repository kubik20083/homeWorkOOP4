/**
 * Main
 */
/*
 * -- Создать класс Учитель
 * -- Создать класс УчительСервис ;(добавляем валидацию)
 * — Создать класс УчительВью;(Выводим в консоль)
 * — Создать класс УчительКонтроллер(Работа с данными: принимает данные в класс
 * Учитель и отправляет в Учитель вью)
 * и реализовать возможность создания, редактирования конкретного учителя и
 * отображения списка учителей,
 * имеющихся в системе.
 * -- Создать класс ГруппаУчителей
 * --Добавить поле учитель в учебную группу
 * 
 * Формат сдачи: ссылка на гитхаб проект
 */
public class Main {

    public static void main(String[] args) {

        TeacherView viewer = new TeacherView();
        viewer.ViewApp();

    }
}