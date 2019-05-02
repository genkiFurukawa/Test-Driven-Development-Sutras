class TestCase:
    def __init__(self, name):
        self.name = name
    
    def run(self):
        # getattr:objectの指定された属性を取得する
        method = getattr(self, self.name)
        method()        

class WasRun(TestCase):
    def __init__(self, name):
        self.wasRun = None
        # self.name = name
        super().__init__(name)
    
    # def run(self):
    #     # getattr:objectの指定された属性を取得する
    #     method = getattr(self, self.name)
    #     method()

    def testMethod(self):
        self.wasRun = 1

class TestCaseTest(TestCase):
    def testRunnig(self):
        test = WasRun("testMethod")
        assert(not test.wasRun)
        test.run()
        assert(test.wasRun)


TestCaseTest("testRunnig").run()
# test = WasRun("testMethod")
# print(test.wasRun)
# test.run()
# print(test.wasRun)