import os



class GenericFile:
    def get_path(self):
        pass
    def get_freq(self):
        pass


class TextASCII(GenericFile):
    def __init__(self,path,fr):
        self.path_absolute=path
        self.frecvente=fr
    def get_freq(self):
        return self.frecvente
    def get_path(self):
        return self.path_absolute
    def __repr__(self):
        return self.path_absolute

class TextUNICODE(GenericFile):
    def __init__(self,path,fr):
        self.path_absolute=path
        self.frecvente=fr
    def get_freq(self):
        return self.frecvente
    def get_path(self):
        return self.path_absolute
    def __repr__(self):
        return self.path_absolute

class Binary(GenericFile):
    def __init__(self,path,fr):
        self.path_absolute=path
        self.frecvente=fr
    def get_freq(self):
        return self.frecvente
    def get_path(self):
        return self.path_absolute
    def __repr__(self):
        return self.path_absolute


def detectTYPE(content,path):
    frec= [0]*255
    nrcar = 0;
    for c in content:
       frec[ord(c)] += 1
       nrcar +=1
    if ( (frec[ord("0")]/nrcar)>=0.3 ):
        return TextUNICODE(path,frec)
    fr=frec[int("9")]+frec[int("10")]+frec[int("13")]
    for i in range(32,128) :
        fr+=frec[int(str(i))]
    if ((fr/nrcar)>0.4):
        return TextASCII(path,frec)
    else:
        return Binary(path,frec)


if __name__ == "__main__":
    _files=[]
    ROOT_DIR=os.path.dirname(os.path.abspath(__file__))
    for root,subdirs,files in os.walk(ROOT_DIR):
        for file in os.listdir(root):
            if file.endswith("txt"):
                file_path=os.path.join(root,file)
                if os.path.isfile(file_path):
                    f=open(file_path,'r')
                    try:
                        content=f.read()
                        _files.append(detectTYPE(content,file_path))
                    finally:
                        f.close()
    for file in _files:
        print(file)