class laptop:
    price=0
    proc=""
    ram=""
    def Lprice():
        print("Laptop price")
    def Lprocessor():
        print("Laptop Procesoor")
    def Lram():
        print("Laptop Ram")

hp = laptop()
dell = laptop()
lenevo= laptop()

hp.price="80000"
hp.proc="i5"
hp.ram="8GB"

print(hp.price)
print(hp.proc)
print(hp.ram)

dell.price="100000"
dell.proc="i10"
dell.ram="16GB"

print(dell.price)
print(dell.proc)
print(dell.ram)

lenevo.price="80000"
lenevo.proc="i5"
lenevo.ram="8GB"

print(lenevo.price)
print(hp.proc)
print(hp.ram)
