# -*- coding:GBK -*-
# Authro:          jzc
# Program:        ollybdg娴嬭瘯
# History:        2018/3/7
import os

def test():
    print("请输入密码")
    str =input(":")
    if str == 123 :
        print("欢迎")
        fo = open("123.txt", "w")
        fo.write('哈哈') 
        fo.close
    else:
        print("错误")

         
test()