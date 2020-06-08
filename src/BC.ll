declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

@x = global i32 0
@squ = global i32 0
@str0 = constant[3 x i8] c" \0A\00"
@str1 = constant[3 x i8] c" \0A\00"
define i32 @main() nounwind {
  store i32 30, i32* @x
  store i32 10, i32* @squ
  %1 = load i32, i32* @x
  %2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %1)
  %3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [3 x i8], [3 x i8]* @str0, i32 0, i32 0))
  %4 = load i32, i32* @squ
  %5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %4)
  %6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [3 x i8], [3 x i8]* @str1, i32 0, i32 0))
  ret i32 0
}
