def solution(my_string):
    answer = []
    
    for n in my_string:
        if n.isalpha()==False:
            answer.append(int(n))
            
    answer.sort()
    return answer