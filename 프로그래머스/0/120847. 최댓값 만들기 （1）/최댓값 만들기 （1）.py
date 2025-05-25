def solution(numbers):
    answer = 0
    numbers.sort()
    
    n = len(numbers)
    answer = numbers[n-1] * numbers[n-2]
    
    return answer