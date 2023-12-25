  def call() {
    def content = libraryResource "/com/sharelib/test.sh"
      writerFile file: "bash_Script.sh" , text: content
      sh "ls -a bash_Script.sh"
      sh "bash ./bash_Script.sh"
  }
