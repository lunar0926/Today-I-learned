'''
컴퓨터과학적사고
201600372 박재형
과제 - 집 그리기
입체적으로 보이는 집을 그렸습니다.

python documentation을 참고하였습니다.
(https://docs.python.org/3/library/turtle.html?highlight=turtle#module-turtle)
'''
# turtle 모듈 
import turtle as tt # turtle이 반복적으로 사용되기 때문에 tt로 축약해서 사용.
tt.Screen()


# 바닥과 벽 그리기
tt.pensize(15)
tt.left(150)
tt.forward(200)
tt.right(60)
tt.forward(150)
tt.penup()
tt.goto(0,0) # 원점으로 돌아가서 다음 선 그리기

tt.pendown()
tt.forward(150)
tt.penup()
tt.goto(0,0) # 원점으로 돌아가서 다음 선 그리기

tt.pendown()
tt.right(60)
tt.forward(200)
tt.left(60)
tt.forward(150)


# 지붕 그리기
tt.pencolor('red') 
tt.penup() # 원점으로 돌아간 뒤 지붕을 그리기 위해 펜 위치 이동
tt.goto(0,0) 
tt.forward(150)
tt.right(60)
tt.pendown() 
tt.forward(220)
tt.left(90)
tt.forward(120)
tt.left(90)
tt.forward(240)
tt.left(90)
tt.forward(120)
tt.left(90)
tt.forward(20)

tt.penup()
tt.forward(220)
tt.left(90)
tt.forward(120)
tt.left(90)
tt.forward(240)
tt.pendown() 
tt.right(30)
tt.forward(120)
tt.right(150)
tt.forward(240)
tt.right(30)
tt.forward(120)



# 창문 1
tt.pencolor('skyblue') 
tt.pensize(5)
tt.penup()
tt.goto(0,0)
tt.left(30)
tt.forward(100)

tt.left(60)
tt.forward(45)
tt.pendown()

tt.forward(60)
tt.left(120)
tt.forward(60)
tt.left(60)
tt.forward(60)
tt.left(120)
tt.forward(60)

# 창문 1의 창살
tt.penup()
tt.left(60)
tt.forward(30)
tt.left(120)
tt.pendown()
tt.forward(60)

tt.penup()
tt.right(120)
tt.forward(30)
tt.right(60)
tt.forward(30)
tt.right(120)
tt.pendown()
tt.forward(60)



# 문
tt.pencolor('black')
tt.penup()
tt.goto(0,0)
tt.left(120)
tt.forward(180)
tt.left(60)

tt.pendown()
tt.forward(100)
tt.left(120)
tt.forward(60)
tt.left(60)
tt.forward(100)

# 문고리
tt.penup()
tt.left(120)
tt.forward(60)
tt.left(60)
tt.forward(50)
tt.left(120)
tt.forward(10)
tt.pendown() 
tt.pencolor('grey')
tt.dot(10) 


# 창문 2
tt.pencolor('yellow')
tt.pensize(5)
tt.penup()
tt.home()
tt.left(150)
tt.forward(30)
tt.right(60)
tt.forward(60)

tt.pendown()
tt.forward(60)
tt.left(60)
tt.forward(60)
tt.left(120)
tt.forward(60)
tt.left(60)
tt.forward(60)

# 창문 2의 창살
tt.penup()
tt.left(120)
tt.forward(30)
tt.left(60)
tt.pendown()
tt.forward(60)

tt.penup()
tt.right(60)
tt.forward(30)
tt.right(120)
tt.forward(30)
tt.right(60)
tt.pendown()
tt.forward(60)

# 창문 3
tt.pencolor('green')
tt.penup()
tt.right(120)
tt.forward(50)
tt.right(60)
tt.pendown()
tt.forward(60)
tt.left(60)
tt.forward(60)
tt.left(120)
tt.forward(60)
tt.left(60)
tt.forward(60)

# 창문 3의 창살
tt.penup()
tt.left(120)
tt.forward(30)
tt.left(60)
tt.pendown()
tt.forward(60)
tt.right(60)
tt.forward(30)
tt.right(120)
tt.forward(30)
tt.right(60)
tt.forward(60)



