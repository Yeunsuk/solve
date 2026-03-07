from collections import Counter

def solution(participant, completion):
    answer = {}
    partCounter = Counter(participant)
    compCounter = Counter(completion)
    answer = partCounter - compCounter
  
    return list(answer.keys())[0]