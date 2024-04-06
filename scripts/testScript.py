###############
import random
import time
import sys
###############

def main():

    with open("temp.txt") as A:
        A = random.choice(list(A))

    print("\Test\n",A)

    time.sleep(2)
    
main()