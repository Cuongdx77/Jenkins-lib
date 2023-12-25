  def call() {
    def content = libraryResource "/com/sharelib/test.sh"
      writerFile file: "test.sh" , text: content
      sh "chmod a+x ./test.sh"
  }
