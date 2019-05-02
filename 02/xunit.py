class TestCase:
    def __init__(self, name):
        self.name = name

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def run(self):
        self.setUp()
        # getattr:objectの指定された属性を取得する
        method = getattr(self, self.name)
        method
        self.tearDown()
    
class WasRun(TestCase):
    # def __init__(self, name):
    #     self.wasRun = None
    #     # self.name = name
    #     super().__init__(name)
    
    def setUp(self):
        # self.wasRun = None
        # self.wasSetUp = 1
        self.log = "setUp "
    
    # def run(self):
    #     # getattr:objectの指定された属性を取得する
    #     method = getattr(self, self.name)
    #     method()

    def testMethod(self):
        # self.wasRun = 1
        self.log = self.log + "testMethod "

    def tearDown(self):
        self.log = self.log + "tearDown "

class TestCaseTest(TestCase):
    def setUp(self):
        self.test = WasRun("testMethod")

    # def testRunnig(self):
    #     # test = WasRun("testMethod")
    #     # assert(not test.wasRun)
    #     self.test.run()
    #     assert(self.test.wasRun)
    
    def testTemplateMethod(self):
        test = WasRun("testMethod")
        test.run()
        assert("setUp testMethod " == self.test.log)
    
    def testSetUp():
        # test = WasRun("testMethod")
        self.test.run()
        assert("setUp testMethod " == self.test.log)


# TestCaseTest("testRunnig").run()
TestCaseTest("testTemplateMethod").run()
TestCaseTest("testSetUp").run()
# test = WasRun("testMethod")
# print(test.wasRun)
# test.run()
# print(test.wasRun)