class Solution(object):
    def findWinners(self, matches):
        all, los, x = set(), set(), set()
        for winner, loser in matches:
            all.add(winner)
            if loser not in los:
                x.add(loser)
            elif loser in x:
                x.remove(loser)
            los.add(loser)
            
        win, x = list(all-los), list(x)
        x.sort()
        win.sort()
        return [win, x]