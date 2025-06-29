def solution(my_string):
    answer = ''
    
    for n in my_string:
        if n.islower():
            answer += n.upper()
        else: 
            answer += n.lower()
    return answer