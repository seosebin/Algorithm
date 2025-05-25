def solution(n):
    answer = 0
    arr = list(str(n))
    for a in arr:
        answer += int(a)
    return answer