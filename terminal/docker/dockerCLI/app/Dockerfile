# This image is awesome!
#FROM ubuntu
#
#COPY . /app
#
#RUN apt -y update && apt -y install curl

#ENTRYPOINT /app/app.sh
#ENTRYPOINT [ "/app/app.sh" ]

#1
#CMD [ "/app/app.sh" ]
#2
#ENTRYPOINT [ "/app/app.sh" ]
#CMD [ "--argument" ]
#3
#ENTRYPOINT [ "/app/app.sh", "--argument" ]

FROM ubuntu

COPY . /app

#ARG curl_bin="curl"
ENV curl_bin="curl"

RUN apt -y update && apt -y install "$curl_bin"

ENTRYPOINT [ "/app/app.sh" ]
CMD [ "--argument" ]