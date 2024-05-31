a=[]
print("Enter the first 7 natural number")
for i in range(1,8):
    num=int(input("Enter number:"+str(i)))
    a.append(num)
print("The first 7 natual number is:",a)

sum=0
for i in a:
    sum=sum+i
print(sum)
