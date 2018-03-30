"""
Pishty is a little boy who lives in Khust, an ancient town with a castle and smart bears. Right now, he wants you to help him with a programming problem.

You are given a sequence A1, A2, ..., AN and Q queries. There are two types of queries:

1 pos val — Set Apos = val.
2 l r — Find the maximum possible perimeter of a triangle with non-zero area whose sides are elements of the subsequence Al, Al+1, ..., Ar. Note that each element of the subsequence can only be used as the length of at most one side, i.e. the sides of each valid triangle must be elements Ax, Ay, Az, where l ≤ x < y < z ≤ r.
For each query of the second type, compute the maximum possible perimeter or determine that no valid triangle exists.

Input
The first line of the input contains two space-separated integers N and Q.
The second line contains N space-separated integers A1, A2, ..., AN.
Q lines follow. Each of these lines describes one query in the following format:
1 pos val for a query of the first type
2 l r for a query of the second type
Output
For each query of the second type, print a single line containing one integer — the maximum perimeter or 0 if no triangle can be formed.

Constraints
1 ≤ N, Q ≤ 105
1 ≤ Ai ≤ 109 for each valid i
1 ≤ val ≤ 109
1 ≤ l ≤ r ≤ N
1 ≤ pos ≤ N
Subtasks:
Subtask #1 (5 pts): 1 ≤ N, Q ≤ 100

Subtask #2 (25 pts): 1 ≤ N, Q ≤ 2000

Subtask #3 (70 pts): original constraints

Example
Input:

5 4
3 1 8 9 7
2 1 5
1 2 12
2 1 3
2 2 5

Output:

24
0
29
Explanation
The first query asks us to find the maximum perimeter of a triangle using some of the elements {3, 1, 8, 9, 7}. We can take the elements 7, 8, and 9 and construct a triangle using these three elements as side lengths. This triangle has perimeter 7 + 8 + 9 = 24, which is the maximum possible perimeter. Hence the answer is 24.

The second query asks us to change the second element to 12.

The third query asks us to find the maximum perimeter of a triangle using some of the elements {3, 12, 8}. These three elements do not form a triangle, hence the answer is 0.

The fourth query asks us to find the maximum perimeter of a triangle using some of the elements {12, 8, 9, 7}. We can take the elements 8, 9 and 12 and make a triangle using these three elements as side lengths. This triangle has perimeter 8 + 9 + 12 = 29, which is maximum possible. Hence the answer is 29.
"""
def problem():
	n,q=map(int,input().split())
	sides=list(map(int,input().split()))
	for i in range(q):
		ch,a,b=map(int,input().split())
		if ch==1:
			sides[a-1]=b
		else:
			
			print(tri_perimeter(sides[a-1:b]))
			

def tri_perimeter(sides):
	""" given a list u need to find maximum perimeter form by choosing any three number from the list"""
	sides.sort(reverse=True)
	perimeter=0
	for i in range(len(sides)-2):
		if(sides[i]<sides[i+1]+sides[i+2]):
			perimeter=sides[i]+sides[i+1]+sides[i+2]
			#print(perimeter)
			break
	return perimeter

problem()



	
	
	