def solution(rsp):
    answer = ''
    str = list(rsp)
    
    for s in str:
        if s == '0':
            answer += '5'
        elif s == '2':
            answer += '0'
        else :
            answer += '2'
            
    return answer