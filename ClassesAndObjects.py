class goa:
    name=""
    drink=""
    def party(self):
        print("lets party.....")
    def beach(self):
        print("enjoying the beach")

ramesh = goa()
suresh = goa()

ramesh.name="Ramesh"
ramesh.drink="Yes Drinks"
suresh.name="Suresh"
suresh.drink="No Drinks"

print(ramesh.name)
print(ramesh.drink)
print(suresh.name)
print(suresh.drink)

ramesh.party()
suresh.beach()
