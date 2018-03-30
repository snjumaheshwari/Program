def sum_traversal(root):
    global s_or
    child=Tree[root]
    if(not child):
        return s_or[root]
    else:
        sum_or=0
        for i in child:
            sum_or |= sum_traversal(i)
        s_or[root]|= sum_or
        return s_or[root]

def final_4(node):
    global x,root
    #print(" in final with root and x are",node,x)
    child=Tree[node]
    count=0
    pos=-1
    for i in child:
        if(s_or[i]==max_or):
            count+=1
            pos=i
    #print(count)
    if(count!=1):
        return (x-1)
    else:
        child.remove(pos)
    #print(child,pos)
    for i in child:
        value_list[root]|=s_or[i]
        #print("updated value of root",value_list[root])
    if(value_list[root]==s_or[pos]):
        return(x-1)
    value_list[root]|=value_list[pos]
    x=x-1
    return final_4(pos)
    
        

N=int(input())
value_list=list(map(int,input().split()))
count=0
Tree=[[] for i in range(N)]
root=set(range(N))

for i in range(N-1):
    t1,t2=map(int,input().split())
    t1=t1-1
    t2=t2-1    
    root.discard(t2)
    Tree[t1].append(t2)

#print(Tree)
#print(root) # it's guerrented that root contains one element only..
root=root.pop()
s_or=[]
for i in range(N):
    s_or.append(value_list[i])
            
# use postorder traversal(DFS) for rest...
sum_traversal(root)
#print(" sum of or ",s_or)

max_or=s_or[root]
x=0
for i in s_or:
    if(i==max_or):
        x+=1
#print("maximum possible answer",x-1)
print(final_4(root))


