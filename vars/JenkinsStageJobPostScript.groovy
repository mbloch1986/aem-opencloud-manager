#!/usr/bin/env groovy

def call(script) {
  // Call Jenkins Job Stage post-script
  script.sh """
  if [ -e /tmp/shinesolutions/aem-opencloud-manager/stage-post-common.sh ]
  then
     echo "Executing Stage post-script"
     /tmp/shinesolutions/aem-opencloud-manager/stage-post-common.sh
  else
    echo "Stage pre-script not found. Skipping..."
  fi
  """
}
