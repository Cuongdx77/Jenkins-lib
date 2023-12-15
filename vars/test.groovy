  def runMyPython() {
    final pythonContent = libraryResource('test.py')
    // There are definitely better ways to do this without having to write to the consumer's workspace
    writeFile(file: 'test.py', text: pythonContent)
    sh('python ./test.py')
  }
