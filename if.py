salary=int(input("enter salary:"))
age=int(input("enter age:"))
if(salary>=20000 or age<=25):
    loan=int(input("enter loan amount:"))
    if(loan>50000):
        print("maximum loan amount is 50000")
    else:
        print("you are eligible for loan")
else:
    print("you are not eligible for loan")
