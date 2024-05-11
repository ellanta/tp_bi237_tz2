# Техническое задание №2

[![Java](https://github.com/ellanta/tp_bi237_tz2/actions/workflows/github-actions.yml/badge.svg)](https://github.com/ellanta/tp_bi237_tz2/actions/workflows/github-actions.yml)

### Описание проекта
Данная программа позволяет считывать из файла числа, а далее отдельными функциями искать среди этих чисел минимальное число, максимальное число, считать их общую сумму и произведение.

### Установка программы
Для установки пользователю понадобится **IntelliJ IDEA IDE**.
Необходимо скачать проект, то есть нажать на большую зеленую кнопку в начале репозитория **Code**, далее нажать на **Download ZIP**, разархивировать в корень диска С и добавить в проект файл, из которого программа будет реализовывать действия, разъясненные в *"Описании проекта"*.

### Ввод и вывод
Для запуска программы Main.java пользователю понадобится ввести имя с расширением.

Пример работы программы:

Содержимое файла "123.txt": "1 2 3 4 5"

Ввод пользователя: **123.txt**

Вывод программы:

*Минимальное: 1*

*Максимальное: 5*

*Сумма: 15*

*Произведение: 120*

### Тестирование
Для реализации тестов для проверки корректности функций поиска минимума, максимума, сложения и умножения необходимо запустить файл **BasicTest.java**.
Для реализации тестов для проверки скорости работы программы при увеличении размера входного файла (для каждой из функций: поиск минимума, максимума, сложение и умножение) необходимо запустить **MainBenchmarks.java**.

### График зависимости времени выполнения от кол-ва чисел в файле
На этом графике изображена зависимость выполнения функции *_sum* в зависимости от количества чисел в входном файле.
![Иллюстрация к проекту](https://github.com/ellanta/tp_bi237_tz2/blob/main/benchmark_result.png)