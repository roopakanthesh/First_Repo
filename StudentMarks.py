a=int(input("enter subject-1 marks:"))
b=int(input("enter subject-2 marks:"))
c=int(input("enter subject-3 marks:"))
d=int(input("enter subject-4 marks:"))
e=int(input("enter subject-5 marks:"))
averagemarks=(a+b+c+d+e)/5
if(averagemarks<35):
    print("Additional class is reqired")
else:
     print("you are good to go")
