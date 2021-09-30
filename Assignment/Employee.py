class Project():
    def __init__(self,id,name,user):
        self.id=id
        self.name=name
        self.user=user
        
class User:
    def __init__(self,id,name,salary):
        self.id=id
        self.name=name
        self.salary=salary

users=[]
users.append(User(1,"anil",10000))
users.append(User(2,"vikas",20000))
users.append(User(3,"vishal",4000))
users.append(User(4,"sai",60000))
users.append(User(5,"abdul",50000))
users.append(User(6,"sreeram",30000))
users.append(User(7,"sahil",15000))

#print user details
for u in users:
    print(u.id," ",u.name," ",u.salary)

projects=[]
projects.append(Project("P1","project1",[i for i in users[:3]]))
projects.append(Project("P2","project2",[i for i in users[3:5]]))
projects.append(Project("P3","project3",[i for i in users[5:7]]))

#print project details
for p in projects:
    print(p.id," ",p.name," ",[[u.id,u.name,u.salary] for u in p.user])

#print user details based on salary retaining project  
def print_details(salary,li):
    for i in li:
        if i.salary==salary:
            print(i.id," ",i.name," ",i.salary)    

for p in projects:
    print(p.id,p.name)
    li=[u.salary for u in p.user]
    for u in sorted(li):
        print_details(u,p.user)
    print("----------------------------------------------------------")

def get_key(value,dict1):
    for k,v in dict1.items():
        if v==value:
            return k

def get_details(salary,l):
    for i in l:
        if i.salary==salary:
            return [i.id,i.name,i.salary]

dict1={}
for i in projects:
    for k in i.user:
        dict1[i.name,k.name]=k.salary 
#print user details based on salary         
for i in sorted(dict1.values()):
    print(get_key(i,dict1),"salary",i)


dict2={}
for i in projects:
    l1=[]
    l=[j.salary for j in i.user]
    for j in sorted(l):
        l1.append(get_details(j,i.user))
    dict2[i.id,i.name]=l1

for k,v in dict2.items():
    print(k,v)

