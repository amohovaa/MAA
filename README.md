# Курсовая работа, Мохова Алена, ИБ-117
Проект включает в себя лексер, парсер (грамматика основана на "pl0"). Строчные и блочные комментарии (взято из грамматики "с"). Использовался генератор анализаторов для формальных языков ANTLR.

## Изменено/добавлено:
##### Результаты и изменения до настоящего момента (21.05.2020) можно найти в репозитории (ссылка - https://github.com/amohovaa/coursework.git). 

Описаны логические операторы AND/OR и метод, относящийся к конструкции WHILE...DO.

Описаны в MyVisitor методы, которые представляют собой операции сложения, вычитания, умножения, деления, а также те, которые относятся к конструкции IF...THEN и базовому выводу WRITE. 

В данный момент происходит изучение Listener и Visitor. Первые попытки написания MyVisitor.

### Основные моменты ТЗ:
#### Требования к входному языку:
1. Присутствуют операторные скобки: конструкция BEGIN…END.
2. Игнорируется индентация программы.
3. Поддерживаются комментарии любой длины: короткий комментарий - LineComment, длинный комментарий - BlockComment.
4. Входная программа должна представляет собой единый модуль, но также есть поддержка вызова функций: объявление процедуры – PROCEDURE, вызов процедуры – CALL.
#### Операторы:	
1. Оператор присваивания: за это отвечает assignstmt.
2. Арифметика (*, /, +, -, >, <, =): condition, expression, term.
3. Логические операторы (И, ИЛИ, НЕ) – “!”, AND/OR.
4. Условный оператор (ЕСЛИ): за это отвечает конструкция IF…THEN.
5. Операторы цикла (while, break, continue): WHILE…DO, BREAK, CONTINUE.
6. Базовый вывод (строковый литерал, переменная) – WRITE.
7. Типы (целочисленный 32 бита, с плавающей запятой 32 бита) – INTEGER, FLOAT.
