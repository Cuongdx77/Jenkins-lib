  def call(Map config = [:]) {
    test(name: 'test.py')
    sh "python ./test.py"
  }
