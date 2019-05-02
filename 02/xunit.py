class TestCase:
    def __init__(self, name):
        self.name = name

    def setUp(self):
        pass

    def run(self):
        self.setUp()
        # getattr:objectの指定された属性を取得する
        method = getattr(self, self.name)
        method

class WasRun(TestCase):
    # def __init__(self, name):
    #     self.wasRun = None
    #     # self.name = name
    #     super().__init__(name)
    
    def setUp(self):
        self.wasRun = None
        self.wasSetUp = 1
    
    # def run(self):
    #     # getattr:objectの指定された属性を取得する
    #     method = getattr(self, self.name)
    #     method()

    def testMethod(self):
        self.wasRun = 1

class TestCaseTest(TestCase):
    def setUp(self):
        self.test = WasRun("testMethod")

    def testRunnig(self):
        # test = WasRun("testMethod")
        # assert(not test.wasRun)
        self.test.run()
        assert(self.test.wasRun)
    
    def testSetUp():
        # test = WasRun("testMethod")
        self.test.run()
        assert(self.test.wasSetUp)


TestCaseTest("testRunnig").run()
TestCaseTest("testSetUp").run()
# test = WasRun("testMethod")
# print(test.wasRun)
# test.run()
# print(test.wasRun)