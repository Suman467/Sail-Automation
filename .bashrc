function replace_catalyst_server_keys() {
    for file in config/usertype_registration/*.xml; do
	sed -i '' 's/SERVER_URL/https:\/\/www.catalyst.dev.optisom.com\/welcome\//g' "$file"
	sed -i '' 's/UT_STANDARD/standard/g' "$file"
      	sed -i '' 's/UT_SKIPHST/skiphst/g' "$file"
 	sed -i '' 's/UT_HST/hstentry/g' "$file"
	sed -i '' 's/UT_DSM/dsm/g' "$file"
 	sed -i '' 's/UT_DRIVER/driver/g' "$file"
	sed -i '' 's/UT_CPAP/cpap/g' "$file"
 	sed -i '' 's/UT_CONSULT/consult/g' "$file"
 	sed -i '' 's/UT_ASYNC/async/g' "$file"  
      sed -i '' 's/UT_FOLLOWUP/followup/g' "$file"
      sed -i '' 's/UT_SCMG/scmg/g' "$file" 
      sed -i '' 's/UT_OFFBOARD/offboard/g' "$file"
      sed -i '' 's/UT_FREEAPP/free-app/g' "$file"
	sed -i '' 's/UT_SIGNIFIER/signifier/g' "$file"
    done
}
