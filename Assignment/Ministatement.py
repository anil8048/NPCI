balance=0
atm={100:2,200:3,500:10}
for i in atm:
   balance=balance+(i*atm[i])
print("Starting balance:",balance)
li=[]
while(True):
    amt=int(input("enter the amount to be withdrawn: "))
    if amt< (balance*90)/100:
        rem=amt
        while(rem!=0):
           if rem%500==0:
               if atm[500]!=0:
                   if rem/500<=atm[500]:
                        atm[200]=int(atm[500])-int(rem/500)
                        rem=0
                   else:
                       am1t=rem-atm[500]*500
                       atm[500]=0
               else:
                   print("This Demoniations is unavailable")
                   amt=0
                   break
                   
           elif rem%200==0:
               if atm[200]!=0:
                   if rem/200<=atm[200]:
                       
                       atm[200]=int(atm[200])-int(rem/200)
                       rem=0
                   else:
                       am1t=rem-atm[200]*200
                       atm[200]=0
               else:
                   print("This Demoniations is unavailable")
                   amt=0
                   break;
               
           elif rem%100==0:
               if atm[100]!=0:
                   if rem/100<=atm[100]:
                       atm[100]=int(atm[100])-int(rem/100)
                       rem=rem-int(rem/100)*100
                   else:
                       am1t=rem-(int(atm[100])*100)
                       atm[100]=0
               else:
                   print("This Demoniations is unavailable")
                   amt=0
                   break;
               
           else:
               print("This Demoniation Combination is unavailable")
               amt=0
               break;
        balance=balance-amt
        li.append("withdrawn "+str(amt)+" remaining balance: "+str(balance))
        print(li)
    else:
        print("Insuffucient balance")
       
       
    ch=int(input("0.To continue \n1.To exit  \n2. To view last 3 transactions\n"))
    if ch==1:
       break
    elif ch==2:
       c=0
       print("MINI STATEMENT")
       for i in reversed(li):
           print(i)
           c=c+1
           if c==3:
               break
    print("Do you still want to continue :")
    ch1=input("enter choice: yes/ no \n") 
    if ch1=="no":
       break
