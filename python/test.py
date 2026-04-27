with open("test.txt") as file:
  c = 0
  for l in file:
    if l.strip():
      if l.split(":")[1]:
        c +=1
  print(c)