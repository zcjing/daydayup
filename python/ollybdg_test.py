# -*- coding:GBK -*-
# Authro:          jzc
# Program:        ollybdg测试
# History:        2018/3/7
import os

def test():
    print("����������")
    str =input(":")
    if str == 123 :
        print("��ӭ")
        fo = open("123.txt", "w")
        fo.write('����') 
        fo.close
    else:
        print("����")

         
test()