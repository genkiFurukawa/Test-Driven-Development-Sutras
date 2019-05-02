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
    def setUp(self):
        self.log = "setUp "

    def testMethod(self):
        self.log = self.log + "testMethod "

    def tearDown(self):
        self.log = self.log + "tearDown "

class TestCaseTest(TestCase):
    def setUp(self):
        self.test = WasRun("testMethod")
    
    def testTemplateMethod(self):
        test = WasRun("testMethod")
        test.run()
        assert("setUp testMethod " == self.test.log)
    
    def testSetUp():
        self.test.run()
        assert("setUp testMethod " == self.test.log)

TestCaseTest("testTemplateMethod").run()
TestCaseTest("testSetUp").run()