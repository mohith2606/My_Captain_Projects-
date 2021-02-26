# Python program to print all positive numbers in a range
L1 = [12, -7, 5, 64, -14]
L2 = [12, 14, -95, 3]
for n1 in L1:
    if n1 >=0 :
        print(n1,end =" ")
n2 = list(filter(lambda x:x>0,L2))
print('\n',n2)
