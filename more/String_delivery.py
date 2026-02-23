delivery_summary ="""

    COLLECTION RATE  AMOUNT PER PERCEL    BASE PAY

    less than 50%                 160         5,000

    50 - 59%                      200         5,000

    60 - 69%                      250         5,000

    > = 70%                       500         5,000
 """
print (delivery_summary)

wages = 0
delivery = int(input("Enter number of successful deliveries made by day "))

if delivery < 50:
    wages =delivery * 160 + 5000
    print(wages)

elif  delivery >= 50 and delivery <= 59:
    wages =delivery * 200 + 5000
    print(wages)


elif delivery >= 60 and delivery <= 69:
    wages =delivery  * 250 + 5000
    print(wages)

elif  delivery >=70:
    wages = delivery * 500 + 5000
    print(wages)

