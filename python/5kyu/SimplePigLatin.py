# Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
# Examples

# pig_it('Pig latin is cool') # igPay atinlay siay oolcay
# pig_it('Hello world !')     # elloHay orldway !


def pig_it(text):
    data = text.split(" ")
    for i in range(len(data)):
        temp = data[i][0]
        if(data[i].isalpha()):
            data[i] = data[i][1:]+temp+"ay"
    return " ".join(data)
