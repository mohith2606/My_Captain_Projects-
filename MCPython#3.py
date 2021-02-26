# Program to display the Fibonacci sequence up to Nth term :
n1, n2 = 0, 1
count = 0
nth = int(input("How many terms? "))
if nth <= 0:
   print("Please enter a positive integer")
elif nth == 1:
   print("Fibonacci sequence upto",nth,":")
   print(n1)
else:
   print("Fibonacci sequence:")
   while count < nth:
       print(n1)
       n = n1 + n2
       n1 = n2
       n2 = n
       count += 1
