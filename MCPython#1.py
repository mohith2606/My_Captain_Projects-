# Task : 1 , Area of a circle :
r = float(input("Input the radius of the circle : "))
a = 3.14 * r * r;
print('The area of the circle with radius',r,'is',a)

# Task : 2 , Program to indentify and print extension :
filename = str(input("Input the Filename: "))
x = filename.split(".")
y = (x[1])
if y == 'py' :
    print ("The extension of the file is : 'python'")
else :
    print('The given file is not supported')
