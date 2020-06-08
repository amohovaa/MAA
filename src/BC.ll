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
define i32 @main() nounwind {
  br i1 %0, label %true1, label %false1
  true1:
  br label %false1
  false1:
  %1 = load i32, i32* @x
  %2 = icmp eq i32 %1, 10
  br i1 %2, label %true2, label %false2
  true2:
  store i32 2000, i32* @squ
  %3 = load i32, i32* @squ
  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
  %5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [3 x i8], [3 x i8]* @str0, i32 0, i32 0))
  br label %false2
  false2:
  ret i32 0
}
