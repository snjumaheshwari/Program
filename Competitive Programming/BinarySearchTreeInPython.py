# Binary Search Tree in Python..


class Node:
	def __init__(self,item):
		self.value=item
		self.left=None
		self.right=None
		
def insert(root,node):
	if root is None :
		root=node
	else:
		if root.value < node.value:
			if root.right is None:
				root.right = node
			else:
				insert(root.right, node)
		else:
			if root.left is None:
				root.left = node
			else:
				insert(root.left, node)
				
def inorder(root):
	if root:
		inorder(root.left)
		print(root.value)
		inorder(root.right)
 
			
		

def search (root,item):
	if(root is None or root.value==item):
		return root
	if(item > root.value):
		return search(root.right,item)
	else:
		return Search(root.left,item)
		
def minValueNode(root):
	if(root is None):
		return None
	while(root.left is not None):
		root=root.left
	return root
	
def deleteNode(root, key):
    if root is None:
        return root 

    if key < root.key:
        root.left = deleteNode(root.left, key)

    elif(key > root.key):
        root.right = deleteNode(root.right, key)
 
    # If key is same as root's key, then this is the node
    # to be deleted
    else:
         
        # Node with only one child or no child
        if root.left is None :
            temp = root.right 
            root = None
            return temp 
             
        elif root.right is None :
            temp = root.left 
            root = None
            return temp
 
        # Node with two children: Get the inorder successor
        # (smallest in the right subtree)
        temp = minValueNode(root.right)
 
        # Copy the inorder successor's content to this node
        root.key = temp.key
 
        # Delete the inorder successor
        root.right = deleteNode(root.right , temp.key)
 
 
    return root
	
		
		

