list1=[]
dict1={}
dict2={}
def create_dict(list1):
    for i in list1:
        dict1[i]=i
def sort_dict(dict1):
    global dict2
    dict2={k: v for k, v in sorted(dict1.items(),key=lambda item:item[1],reverse=True)}
x=lambda x:list1.append(x)
def lamda():
    ch=int(input("enetr option"))
    if ch==1:
        x((int(input("enter element"))))
    if (ch==2 or ch==3) and (len(list1)==0):
        x((int(input("enter an elemnt"))))
    if ch==2:
        create_dict(list1)
    if ch==3:
        sort_dict(dict1)
    if ch!=4:
        lamda()
lamda()
print(list1)
print(dict1)
print(dict2)
