a=int(input("enter number-1:"))
b=int(input("enter number-2:"))
operation=input("add/sub/mul/div/rem:")
if(operation=="add"):
   print("The sum is:",a+b)
elif(operation=="sub"):
   print("The difference is:",a-b)
elif(operation=="mul"):
   print("The product is:",a*b)
elif(operation=="div"):
   print("The quotient is:",a/b)
elif(operation=="rem"):
   print("The remainder is:",a%b)
else:
    print("Invalid operation")
