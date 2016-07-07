# Question: https://python.web.id/blog/differentsymbolsnaive-cf/

def differentSymbolsNaive(s):
    result = 0
    for i in range(26):
        found = False
        j = 0
        while j < len(s):
            if ord(s[j]) == ord('a') + i:
                found = True
            j += 1
        if found:
            result += 1
    return result
