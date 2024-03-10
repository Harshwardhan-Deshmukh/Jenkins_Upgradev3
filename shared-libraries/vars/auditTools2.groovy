def call(Map config) {
    node {
      // echo "${config.message}"
      echo "${config}"
      sh '''
        git version
        java -version
        mvn -version
      '''
    }
}