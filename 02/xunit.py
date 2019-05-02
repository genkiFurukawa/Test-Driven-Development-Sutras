class WasRun:
    def __init__(self, name):
        self.wasRun = None
        self.name = name
    
    def run(self):
        # getattr:objectの指定された属性を取得する
        method = getattr(self, self.name)
        method()

    def testMethod(self):
        self.wasRun = 1

test = WasRun("testMethod")
print(test.wasRun)
test.run()
print(test.wasRun)