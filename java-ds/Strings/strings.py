str1 = "my name is nitesh"

str_len = len(str1) # 16

str_copy = str1[:] # my name is nitesh

first_char = str1[0] #m
last_char = str1[-1] #h

# slicing;
str1_modified = str1[0:2] + "full name is " + str1[12:] # my full name is nitesh

# building new string
new_str = ""

for char in str1:
    if char != " ":
        new_str += char
    else:
        new_str += "_"

# new_str = my_name_is_nitesh

# looping through string;

for char in str1:
    print(char, ord(char) - ord('a'), end=" ")
# Output: m 12 y 24   n 13 a 0 m 12 e 4   i 8 s 18   n 13 i 8 t 19 e 4 s 18 h 7

# string methods

sorted_str2 = sorted(str1)  # [' ', ' ', ' ', ' ', 'a', 'e', 'h', 'i', 'm', 'm', 'n', 'n', 's', 't', 'y']

rev_sorted_str2 = sorted(str1, reverse=True)  # ['y', 't', 's', 'n', 'n', 'm', 'm', 'i', 'h', 'e', 'a', ' ', ' ', ' ', ' ', ' ']

reverse_str = str1[::-1]  # hsetin si eman ym

str_list = str1.split(' ')  # ['my', 'name', 'is', 'nitesh']

str2 = "Nitesh"
str2_lower = str2.lower()  # nitesh

str2_upper = str2.upper()  # NITESH

str2_title = str2.title()  # Nitesh

str2_capitalize = str2.capitalize()  # Nitesh

str2_swapcase = str2.swapcase()  # nITESH

str2_find = str2.find("t")  # 2 (returns index of first occurrence)

str2_replace = str2.replace("N", "M")  # Mitesh

str2_split = str2.split("i")  # ['N', 'tesh']

str2_join = " ".join(str2_split)  # N tesh

str2_strip = str2.strip("N")  # itesh (removes leading and trailing 'N')

str2_startswith = str2.startswith("N")  # True

str2_endswith = str2.endswith("h")  # True

str2_isalpha = str2.isalpha()  # True (checks if all characters are alphabetic)

str2_isdigit = str2.isdigit()  # False (checks if all characters are digits)

str2_isspace = str2.isspace()  # False (checks if all characters are whitespace)

str2_count = str2.count("i")  # 1 (counts occurrences of 'i')

# String formatting
name = "Nitesh"
age = 30
formatted_str = f"My name is {name} and I am {age} years old."  # My name is Nitesh and I am 30 years old.
